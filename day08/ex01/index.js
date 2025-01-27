const me = {
  name: "sook",
  job: "학생",
  age: 25,
  height: 172,
  married: false,
  hobby: ["코딩", "야구", "카드게임"],
  1: "영화",
  movie: {
    name: "AI 감독관",
    year: 2025,
  },
  hello: function () {
    console.log("안녕하세요!");
  },
  say_my_name: function () {
    console.log(`내 이름은 ${this.name}!`);
  },
};

console.log(me.name);
console.log(me["name"]);
//console.(me.1) 이런거 주의(변수명)
console.log(me[1]);
// 자바스크립트에서의 변수명 혹은 함수명 규칙 + 케이스
me.hello();
me.say_my_name();

function add(a, b) {
  // return a + b;
  return;
  console.log("뒤가 없음");
}
console.log(add(1, 2)); // 인자를 매개변수에 넣는다.
