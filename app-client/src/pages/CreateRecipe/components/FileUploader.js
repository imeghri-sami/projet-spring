import { Button, Typography } from "@mui/material";
import AddPhotoAlternateOutlinedIcon from "@mui/icons-material/AddPhotoAlternateOutlined";
import { Box } from "@mui/system";
import { grey } from "@mui/material/colors";

export default function FileUploader({ onFileUpload }) {
  return (
    <Box
      sx={{
        height: "100%",
        display: "flex",
        flexDirection: "column",
        justifyContent: "center",
        alignItems: "center",
      }}
    >
      <Typography>
        <AddPhotoAlternateOutlinedIcon
          sx={{
            marginBottom: (theme) => theme.spacing(2),
            fontSize: 140,
            transform: "rotate(-5deg)",
            color: grey[400],
          }}
        />
      </Typography>
      <Button
        color="success"
        variant="contained"
        component="label"
        size="small"
      >
        Select from computer
        <input type="file" hidden onChange={onFileUpload} accept="image/*" />
      </Button>
    </Box>
  );
}
