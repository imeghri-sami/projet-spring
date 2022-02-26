import axios from "axios";

export default class CategoryServices {
  fetchAll() {
    return axios
      .get("http://localhost:8080/category/get")
      .then((res) => res.data);
  }
}
