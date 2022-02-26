import axios from "axios";

export default class ProofService {
  upload(name, description, time, catergoryRef, userRef, file) {
    const formData = new FormData();
    formData.append("file", file);

    formData.append("catergoryRef", catergoryRef);
    formData.append("userRef", userRef);
    formData.append("name", name);
    formData.append("description", description);
    formData.append("time", time);

    return axios({
      method: "post",
      url: "/recipes/create",
      data: formData,
      headers: {
        "Content-Type": `multipart/form-data; boundary=${formData._boundary}`,
      },
    })
      .then((response) => response.data)
      .catch((err) => console.log(err.response));
  }
}
