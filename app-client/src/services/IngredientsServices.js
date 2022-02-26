import axios from "axios";

export default class IngredientsServices {
  fetchAll() {
    return axios
      .get("/ingredients/get")
      .then((data) => console.log(data.response))
      .then((data) => console.log(data));
  }
}
