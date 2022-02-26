import {Image } from "@mui/material";
import logo from "../assets/projectLogo.png"
export default function Logo() {
  return (
    // <Typography
    //   variant="h5"
    //   noWrap
    //   component="div"
    //   sx={{ flexGrow: 1, display: { xs: "none", sm: "block" } }}
    // >
    //   INSTAFOOD
    // </Typography>
    <img src={logo}/>
  );
}
