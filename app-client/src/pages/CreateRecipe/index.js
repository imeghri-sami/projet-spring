import { useCallback, useState } from "react";
import Cropper from "react-easy-crop";
import {
  Button,
  Dialog,
  DialogActions,
  DialogContent,
  IconButton,
  Typography,
} from "@mui/material";
import ArrowBackIosRoundedIcon from "@mui/icons-material/ArrowBackIosRounded";
import ConfirmDialog from "../../components/dialog/ConfirmDialog";
import FileUploader from "./components/FileUploader";
import { getCroppedImg } from "./canvasUtils";
import PostWriter from "./components/PostWriter";
import RecipeService from "../../services/RecipeServices";

const DialogActionsStyle = {
  paddingTop: "16px",
  justifyContent: "space-between",
  alignItems: "center",
};

const titles = ["Crop", "Create new post"];

const TypographyStyle = { fontWeight: "bold" };

const DialogContentStyle = {
  width: "544px",
  height: "544px",
};

const DialogStyle = { backgroundColor: "rgba(0, 0, 0, 0.5)" };

const divStyle = {
  aspectRatio: "1/1",
  position: "absolute",
  top: 0,
  left: 0,
  right: 0,
  bottom: "80px",
};

function PostDialogAcitons({
  onBackClick,
  onNextClick,
  title,
  hideActions,
  ...others
}) {
  return (
    <DialogActions {...others} sx={DialogActionsStyle}>
      {hideActions || (
        <>
          <IconButton onClick={onBackClick}>
            <ArrowBackIosRoundedIcon />
          </IconButton>
          <Typography sx={TypographyStyle}>{title}</Typography>
          <Button onClick={onNextClick} variant="text">
            Next
          </Button>
        </>
      )}
    </DialogActions>
  );
}

export default function CreatePostDialog(open = false) {
  const [confirmDialogOpen, setConfirmDialogOpen] = useState(true);
  const [crop, setCrop] = useState({ x: 0, y: 0 });
  const [zoom, setZoom] = useState(1);
  const [isOpen, setIsOpen] = useState(open);
  const [step, setStep] = useState(0);
  const [currentTitle, setCurrentTitle] = useState(titles[step]);
  const [croppedAreaPixels, setCroppedAreaPixels] = useState(null);
  const [croppedImage, setCroppedImage] = useState(null);
  const [values, setValues] = useState({
    name: "",
    description: "",
    time: "",
    catergoryRef: 0,
    userRef: 1,
  });

  const onCropComplete = useCallback((croppedArea, croppedAreaPixels) => {
    setCroppedAreaPixels(croppedAreaPixels);
  }, []);

  function upload() {
    console.log(values);
    new RecipeService().upload(
      values.name,
      values.description,
      values.time,
      croppedImage
    );
  }

  function handleNextClick() {
    if (imageSrc != null) {
      getCroppedImg(imageSrc, croppedAreaPixels).then((img) => {
        setCroppedImage(img);
      });
    }
    setStep((prevStep) => {
      if (prevStep + 1 >= titles.length) {
        upload();
        setIsOpen(false);
        return prevStep;
      }
      setCurrentTitle(titles[prevStep + 1]);
      return prevStep + 1;
    });
  }

  function handleBackClick() {
    setStep((prevStep) => {
      if (prevStep - 1 < 0) {
        setConfirmDialogOpen(true);
        return prevStep;
      }
      setCurrentTitle(titles[prevStep - 1]);
      return prevStep - 1;
    });
  }

  function handleConfirmDiagDiscardClick() {
    setIsOpen(false);
  }

  function readFile(file) {
    return new Promise((resolve) => {
      const reader = new FileReader();
      reader.addEventListener("load", () => resolve(reader.result), false);
      reader.readAsDataURL(file);
    });
  }

  const [imageSrc, setImageSrc] = useState(null);
  const handleFileChange = async (e) => {
    if (e.target.files && e.target.files.length > 0) {
      const file = e.target.files[0];
      let imageDataUrl = await readFile(file);

      setImageSrc(imageDataUrl);
    }
  };

  function getBody() {
    if (imageSrc == null) {
      return <FileUploader onFileUpload={handleFileChange} />;
    } else if (step === 0)
      return (
        <Cropper
          image={imageSrc}
          crop={crop}
          zoom={zoom}
          aspect={1 / 1}
          onCropComplete={onCropComplete}
          onCropChange={setCrop}
          onZoomChange={setZoom}
        />
      );
    else
      return (
        <PostWriter
          croppedImage={croppedImage}
          values={values}
          setValues={setValues}
        />
      );
  }
  return (
    <>
      <Dialog open={isOpen} style={DialogStyle}>
        <DialogContent sx={DialogContentStyle}>
          <div style={divStyle}>{getBody()}</div>
        </DialogContent>

        <PostDialogAcitons
          hideActions={imageSrc == null}
          title={currentTitle}
          onNextClick={handleNextClick}
          onBackClick={handleBackClick}
        />
      </Dialog>
      <ConfirmDialog
        onDiscardClick={handleConfirmDiagDiscardClick}
        open={confirmDialogOpen}
        setOpen={setConfirmDialogOpen}
      />
    </>
  );
}
