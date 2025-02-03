try {
  // const a = "";
  // const a = "";
  // SyntaxError: Identifier 'a' has already been declared
  // SyntaxError는 막아주지 못함

  let a = null;
  console.log(a.a);
  // 객체가 아니라 null에게 프로퍼티 접근을 시도할 경우 에러가 남
} catch {
  console.error("에러!");
}

try {
  let a = null;
  console.log(a.a);
} catch (error) {
  if (error instanceof TypeError) {
    // 소개 정도
    console.log("타입 에러");
  }
  console.error(error);
} // 에러 종류를 알려줌
// TypeError: Cannot read properties of null (reading 'a')

// finally

try {
  const n = null;
  n.n;
  console.log(1);
} catch {
  console.log(2);
} finally {
  console.log(3);
} // 항상 실행 되는 finally 인데,
console.log(4); // 왜 finally가 이렇게 쓰면 안되냐
// 함수의 return값 때문에!!!!

function fin() {
  try {
    if (Math.random() > 0.5) {
      null.n;
    }
    console.log("살았다!");
  } catch {
    console.log("죽었다");
    return 0; // 헤헷이 실행이 안됨
  } finally {
    // 무조건 실행이 됨
    // finally에 return이 있을경우(만약) 무조건 여기서 끝
    console.log("앗");
    return -1;
  }
  // 함수 내에 return이 있으면 도달하지 않음
  console.log("헤헷");
}
fin();

// 다시 던지기, throw해서 흐름 차단하기

try {
  // 확률적 탈출인데... 2중 확률이야 근데 함수도 루프도 아냐...
  if (Math.random() > 0.5) {
    // throw new Error("1차 탈출!!!");
    throw new Error("아이디가 일치하지 않습니다");
  }
  if (Math.random() > 0.5) {
    //   throw new Error("2차 탈출!!!");
    throw new Error("비밀번호가 일치하지 않습니다");
  }
} catch (error) {
  console.log(error);
}

try {
  try {
    // 확률적 탈출인데... 2중 확률이야 근데 함수도 루프도 아냐...
    if (Math.random() > 0.5) {
      // throw new Error("1차 탈출!!!");
      throw new Error("아이디가 일치하지 않습니다");
    }
    if (Math.random() > 0.5) {
      //   throw new Error("2차 탈출!!!");
      throw new Error("비밀번호가 일치하지 않습니다");
    }
  } catch (error) {
    console.log(error);
    throw error;
  }
} catch {
  console.log("아 뭔가 에러가;;;;");
}

// 스코프
const a = 0; // 바깥 블록.
let b = 0;
console.log(b);
try {
  // try 블록
  if (Math.random() > 0.5) null.n;
  const a = 0;
  b++;
  console.log("try", a, b);
} catch {
  // catch 블록
  const a = 0;
  b++;
  console.log("catch", a, b);
} finally {
  // finally 블록
  const a = 0;
  b++;
  console.log("finally", a, b);
}
console.log(a, b);
