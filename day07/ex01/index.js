console.log("Hello, World!");

// 한줄 주석
/* 여러줄 주석 */

//입력, 저장, 계산, 출력
//console.log(foo); // foo 변수 지정이 안되어 에러 발생(웹(js)에서는 에러러)
// var foo; // 기본적으로 'var'라는 키워드가 붙음 => 선언
foo = "apple"; // 변수에 값을 넣어줌 => 대입/할당
console.log(foo);

bar = "mango";
console.log(bar);

var baz = "appleMango"; // 초기화. 변수에 대한 선언, 값에 대한 할당이 한 번에 일어남
// 특정 이름과 메머리에 대한 연결이 2번 이상 일어날 필요가 없기 때문에, 2번 이상 할 필요 없음
// 하지만 var의 경우 재선언이 가능함.
var foo; // 중복 선언에 대해 아무런 반응이 없음.

// let, const (es6+, 2015~)
let dev = 100;
dev = 200; // 재할당
// let dev; // 에러 발생. 재선언이 불가하기 때문. SyntaxError: Identifier 'dev' has already been declared

// 절대 변하면 안된다? imutable(불변), final, constant ..
// 1. immutable -> mutable -> mutate -> property -> class/prototype -> instance
// 2. final -> 주소값만 고정(메모리 주소값) - (일반적으로는 객체인데) 처음을 입력된 레퍼런스 객체 주소값이 안변함
// 3. constant -> 그냥 리터럴 값 그 자체. ex) 유니코드, 상수, 그 값
// 3개를 구별할 줄 알아야 한다!

const feature = 3.14; // 초기화, 선언밖에 안된다. 재선언 재할당X
// feature = 3; // TypeError: Assignment to constant variable.
