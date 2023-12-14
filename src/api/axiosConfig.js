// import axios from 'axios';

// export default axios.create({
//     baseURL:'https://e9d2-103-5-135-109.ngrok-free.app',
//     headers: {
//         "ngrok-skip-browser-warning":"true",
//         'Access-Control-Allow-Origin': '*',
//         'Access-Control-Allow-Methods': 'GET, POST, PUT, DELETE',
//         'Access-Control-Allow-Headers':'Content-Type, Authorization',
//     }
// });

import axios from 'axios';

const instance = axios.create({
    baseURL: 'https://2f82-2409-40f2-1037-6a87-6807-7705-935b-67e0.ngrok-free.app',
    headers: {
        "ngrok-skip-browser-warning":"true",
    },
});

export default instance;