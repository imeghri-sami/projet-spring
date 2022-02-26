import { useState, useEffect } from "react";
import { Box } from "@mui/system";
import { TextField, Divider, MenuItem, Select } from "@mui/material";
import CategoryServices from "../../../services/CategoryServices";
import IngredientsServices from "../../../services/IngredientsServices";

export default function PostWriter({ croppedImage, values, setValues }) {
  const [categories, setCategories] = useState([]);
  const [ingredients, setIngredients] = useState([]);
  const [category, setCategory] = useState("");

  const handleCategoryChange = (event) => {
    setCategory(event.target.value);
  };

  function handleChange(e) {
    setValues({ ...values, [e.target.name]: e.target.value });
  }

  useEffect(() => {
    new CategoryServices().fetchAll().then((response) => {
      setCategories(response);

      new IngredientsServices().fetchAll().then((response) => {
        console.log(response);
        setIngredients(response);
      });
    });
  }, []);

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
        InputProps={{
          disableUnderline: true,
        }}
      />

      <TextField
        onChange={handleChange}
        value={values.description}
        name="description"
        sx={{ marginBottom: "20px", width: "100%" }}
        multiline
        rows={4}
        variant="standard"
        placeholder="Write a description ..."
        InputProps={{
          disableUnderline: true,
        }}
      />

      <TextField
        onChange={handleChange}
        value={values.time}
        name="time"
        sx={{ marginBottom: "20px", width: "100%" }}
        variant="standard"
        placeholder="Add a time "
        InputProps={{
          disableUnderline: true,
        }}
      />
      <Select
        sx={{ width: "100%" }}
        size="small"
        value={category}
        label="Category"
        placeholder="Select a category"
        onChange={handleCategoryChange}
      >
        {categories.map((c) => (
          <MenuItem value={c.ref}>
            <Box
              sx={{
                display: "flex",
                alignItems: "center",
              }}
            >
              <img style={{ marginRight: "8px" }} width="50px" src={c.img} />
              <span> {c.name}</span>
            </Box>
          </MenuItem>
        ))}
      </Select>

      <Divider sx={{ width: "100%", marginBottom: "8px" }} />
    </Box>
  );
}
