import { BottomNavigation, BottomNavigationAction } from "@mui/material";
import HomeOutlinedIcon from "@mui/icons-material/HomeOutlined";
import AddBoxOutlinedIcon from "@mui/icons-material/AddBoxOutlined";
import ExploreOutlinedIcon from "@mui/icons-material/ExploreOutlined";
import AccountCircleOutlinedIcon from "@mui/icons-material/AccountCircleOutlined";
import FavoriteRoundedIcon from "@mui/icons-material/FavoriteRounded";
import { red } from "@mui/material/colors";

import React from "react";
import GoogleLogin from "react-google-login";
import { Box } from "@mui/system";
import CreatePostDialog from "../pages/CreateRecipe";

export default function Navbar({setIsAccount, setIsFavorite,setIsRecipe}) {
  const [value, setValue] = React.useState(0);
  const [isOpen, setIsOpen] = React.useState(false);

  let isSignedIn = true;
  return (
    <Box
      sx={{
        position: "fixed",
        bottom: 10,
        left: 0,
        right: 0,
      }}
    >
      {!isSignedIn ? (
        /* https://www.npmjs.com/package/react-google-login */
        <div
          style={{ display: "flex", justifyContent: "center", padding: "5px" }}
        >
          <GoogleLogin
            clientId=""
            buttonText="Sign up / Login"
            cookiePolicy={"single_host_origin"}
          />
        </div>
      ) : (
        <BottomNavigation
          showLabels
          value={value}
          onChange={(event, newValue) => {
            setValue(newValue);
          }}
        >
          <BottomNavigationAction label="Home" icon={<HomeOutlinedIcon />} />
          <BottomNavigationAction
            onClick={() => setIsOpen(true)}
            label="Create"
            icon={<AddBoxOutlinedIcon sx={{ color: red[600] }} />}
          />
          <BottomNavigationAction
            onClick={()=>{
              setIsAccount(false)
              setIsRecipe(true)
              setIsFavorite(false)
            }}
            label="Explore"
            icon={<ExploreOutlinedIcon />}
          />
          <BottomNavigationAction
            onClick={()=>{
              setIsAccount(false)
              setIsRecipe(false)
              setIsFavorite(true)
            }}
            label="Favorites"
            icon={<FavoriteRoundedIcon />}
          />
          <BottomNavigationAction
            onClick={()=>{
              setIsAccount(true)
              setIsRecipe(false)
              setIsFavorite(false)
            }}
            label="Account"
            icon={<AccountCircleOutlinedIcon />}
          />
        </BottomNavigation>
      )}
      <CreatePostDialog isOpen={isOpen} setIsOpen={setIsOpen} />
    </Box>
  );
}
