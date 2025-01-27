let add = 1 + 1;
console.log("add", add);

let divide = 10 / 7;
console.log("divide", divide);

let modulo = 10 % 7;
console.log("modulo", modulo);

let pow = 10 ** 3;
console.log("pow", pow);
//몫 연산자(//)는 없기 때문에 정수 연산자 활용

console.log("zeroDivine", 1 / 0);
// Ifinity

// 비교연산자 (텍스트는 비교 X)
console.log("1 == 1.0", 1 == 1.0); //(느슨한) 동등
console.log("1 != 1.0", 1 != 1.0); // (느슨한) 부등
console.log(`1=="1.0"`, 1 == "1.0");
console.log(`1 === "1.0"`, 1 === "1.0"); // (엄격한 동등) 일치 // 표현형은 다르나 둘다 number임 (비교 가능)
console.log(`1 !== "1.0"`, 1 !== "1.0"); //(엄격한 부등) 불일치
console.log("1>10", 1 > 10);
console.log("1<10", 1 < 10);
console.log("1>=10", 1 >= 10);
console.log("1><=0", 1 <= 10);
console.log(`"a">"b>`, "a" > "b"); // b에게 부여된 아스키 코드 (문자코드)가 더 커서 b가 더 크다. (a>b false)

// 논리연산자
let condition1 = 100 < 1000; // true
let condition2 = "a" < "b"; // true
let condition3 = 100 > 1000; // false
let condition4 = "a" > "b"; // false

// And (&&) 단축 연산자 - T면 뒤까지 확인, F가 들어오면 뒤는 확인하지 않음
console.log("condition1 && conditino2", condition1 && condition2); // T T
// O -> O => T
console.log("condition1 && conditino3", condition1 && condition3); // T F
// O -> X => F
console.log("condition3 && conditino2", condition3 && condition2); // F T
// X => F
console.log("condition1 && conditino2", condition4 && condition3); // F F
// X => F

// OR(||) 단축 연산자 - T면 뒤까지 확인, F가 들어오면 뒤는 확인하지 않음
console.log("condition1 || conditino2", condition1 || condition2); // T T
// O => T
console.log("condition1 || conditino3", condition1 || condition3); // T F
// O => T
console.log("condition3 || conditino2", condition3 || condition2); // F T
// X -> O => T
console.log("condition4 || conditino3", condition4 || condition3); // F F
// X -> X = F

console.log("!true", !true);
console.log("false", !false);

// 삼항연산자
