import { Typography } from "@mui/material";

export default function Logo() {
  return (
    <Typography
      variant="h5"
      noWrap
      component="div"
      sx={{ flexGrow: 1, display: { xs: "none", sm: "block" } }}
    >
      INSTAFOOD
    </Typography>
  );
}
