// import axios from "axios";

// export default class ProofService {
//   upload(name, description, time, catergoryRef, userRef, file) {
//     const formData = new FormData();
//     formData.append("catergoryRef", catergoryRef);
//     formData.append("userRef", userRef);
//     formData.append("name", name);
//     formData.append("description", description);
//     formData.append("time", time);
//     formData.append("file", file);

//     return axios({
//       method: "post",
//       url: "/",
//       data: formData,
//       headers: {
//         "Content-Type": `multipart/form-data; boundary=${formData._boundary}`,
//       },
//     })
//       .then((response) => response.data)
//       .catch((err) => console.log(err.response));
//   }
// }
