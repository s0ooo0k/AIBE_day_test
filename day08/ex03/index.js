// 객체

const obj = { name: "sook", age: 20 };
console.log(obj);
console.log(Object.keys(obj)); //object 타입의 객체를 담으면.. // 출력 : [ 'name', 'age' ]
// 유틸리티 메서드, 스태틱 메서드
console.log(Object.values(obj)); // 출력 : [ 'sook', 20 ]
console.log(Object.entries(obj)); // 출력 : [ [ 'name', 'sook' ], [ 'age', 20 ] ]

const objk = Object.keys(obj);
for (let index = 0; index < objk.length; index++) {
  const element = objk[index];
  console.log("element", element); // objk의 키 출력
}

for (const v of objk) {
  // 하나씩 뽑아서 출력, index처럼 유지될 필요가 없음
  // const element = objk[index];
  console.log("v", v); // objk의 key 값과 똑같다다
}

for (const key in obj) {
  console.log(key, obj[key]);
}
