import axios from 'axios';

const instance = axios.create({
    baseURL: 'https://73d3-2409-40f2-1d-2d34-9071-2fe4-d1b3-932b.ngrok-free.app',
    headers: {
        "ngrok-skip-browser-warning":"true",
    },
});

export default instance;