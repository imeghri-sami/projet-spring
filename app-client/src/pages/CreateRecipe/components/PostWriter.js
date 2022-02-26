import { Box } from "@mui/system";
import { TextField, Divider } from "@mui/material";

export default function PostWriter({ croppedImage, values, setValues }) {
  function handleChange(e) {
    setValues({ ...values, [e.target.name]: e.target.value });
  }

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
      <img style={{ borderRadius: "4px" }} width="188.3" src={croppedImage} />
      <TextField
        onChange={handleChange}
        value={values.name}
        name="name"
        sx={{ marginTop: "20px", marginBottom: "20px", width: "100%" }}
        variant="standard"
        placeholder="Give your recipe a name"
      />
      <Divider />

      <TextField
        onChange={handleChange}
        value={values.description}
        name="description"
        sx={{ marginBottom: "20px", width: "100%" }}
        multiline
        rows={4}
        variant="standard"
        placeholder="Write a description ..."
      />
      <Divider />
      <TextField
        onChange={handleChange}
        value={values.time}
        name="time"
        sx={{ marginBottom: "20px", width: "100%" }}
        variant="standard"
        placeholder="Add a time "
      />
    </Box>
  );
}
