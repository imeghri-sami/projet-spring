import { Box } from "@mui/system";
import { TextField, Divider } from "@mui/material";
import RecipeService from "../../../services/RecipeServices";

export default function PostWriter({ corppedImg }) {
  const [values, setValues] = useState({
    name: "",
    description: "",
    time: "",
    catergoryRef: 0,
    userRef: 1,
  });

  function upload() {
    new RecipeService().upload(
      values.name,
      values.description,
      values.time,
      corppedImg
    );
  }

  function handleChange() {}

  return (
    <Box
      sx={{
        paddingRight: (theme) => theme.spacing(4),
        paddingLeft: (theme) => theme.spacing(4),
        height: "100%",
        display: "flex",
        flexDirection: "column",
        justifyContent: "center",
        alignItems: "center",
      }}
    >
      <img style={{ borderRadius: "4px" }} width="188.3" src={corppedImg} />
      <TextField
        onChange={handleChange}
        sx={{ marginTop: "20px", marginBottom: "20px", width: "100%" }}
        variant="standard"
        placeholder="Give your recipe a name"
      />
      <Divider />

      <TextField
        onChange={handleChange}
        sx={{ marginBottom: "20px", width: "100%" }}
        multiline
        rows={4}
        variant="standard"
        placeholder="Write a description ..."
      />
      <Divider />
      <TextField
        sx={{ marginBottom: "20px", width: "100%" }}
        variant="standard"
        placeholder="Add a time "
      />
    </Box>
  );
}
