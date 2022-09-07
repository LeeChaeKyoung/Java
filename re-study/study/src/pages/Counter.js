import React, {useState} from "react";

const Counter = () => {
    const [num, setNumber] = useState(0); // 두 변수는 0을 기본값으로 가지는 변수이다 라는 뜻? setNumber는 num을 세팅하기 위한 setter함수?

    const increase = () =>{
        setNumber(num+1); //같이 지정한 setter 함수를 이용해야 변수를 관리할 수 있다.
    }

    const decrease = () =>{
        setNumber(num-1);
    }

    return(
        <div>
            <button onClick={increase}>+1</button>
            <button onClick={decrease}>-1</button>
            <div><p>{num}</p></div>
        </div>
    )
}

export default Counter;