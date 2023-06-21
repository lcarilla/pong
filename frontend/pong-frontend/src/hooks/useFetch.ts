import { useEffect, useState } from "react";

const useFetch = (url: string) => {
    const [data, setData] = useState(null);
    useEffect(()=>{
        fetch(url)
        .then(res=>{
            return res.json(); 
        })
        .then(data=>{
            setData(data)
        })
    }, [])
    return data;
}
export default useFetch;