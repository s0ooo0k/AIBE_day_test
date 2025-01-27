class Programmer {
  constructor(language, device, disease, nation, age, junior, coffee, stress) {
    // this는 현재 객체를 가리킵니다.

    // @/day08/ex02/index.js fill constructor plz..
    this.language = language; // this.language는 현재 객체의 language 속성을 가리킵니다.
    this.device = device; // this.device는 현재 객체의 device 속성을 가리킵니다.
    this.disease = disease; // this.disease는 현재 객체의 disease 속성을 가리킵니다.
    this.nation = nation; // this.nation은 현재 객체의 nation 속성을 가리킵니다.
    this.age = age; // this.age는 현재 객체의 age 속성을 가리킵니다.
    this.junior = junior; // this.junior는 현재 객체의 junior 속성을 가리킵니다.
    this.coffee = coffee; // this.coffee는 현재 객체의 coffee 속성을 가리킵니다.
    this.stress = stress; // this.stress는 현재 객체의 stress 속성을 가리킵니다.
  }

  // @/day08/ex02/index.js 내부에 한글 주석으로 this에 대해 설명해줘. 그리고 introduce라는 개발자 자기 소개 method를 추가해줘
  introduce() {
    console.log(
      `저는 ${this.nation} 출신의 ${this.age}살 프로그래머입니다. 저는 ${
        this.language
      } 언어를 사용하고 ${this.device} 기기를 사용합니다. 저는 ${
        this.disease
      }를 앓고 있고, ${this.junior ? "주니어" : "시니어"} 개발자이며, 하루에 ${
        this.coffee
      }잔의 커피를 마시고, 스트레스 지수는 ${this.stress}입니다.`
    );
  }
}

console.log("========================");
// @/day08/ex02/index.js 적당한 2030 컴퓨터공학과 대학생 혹은 현업 개발자 5명 정도의 표본을 만들어서 줄줄이 for문으로 작성해줘

const programmers = [
  new Programmer("JavaScript", "MacBook", "거북목", "한국", 24, true, 2, 80),
  new Programmer(
    "Python",
    "Windows",
    "손목터널증후군",
    "미국",
    30,
    false,
    3,
    90
  ),
  new Programmer("Java", "Linux", "안구건조증", "일본", 28, true, 1, 70),
  new Programmer("C++", "MacBook", "어깨결림", "한국", 26, false, 2, 85),
  new Programmer("Go", "Windows", "두통", "중국", 32, false, 4, 95),
];

for (const programmer of programmers) {
  programmer.introduce();
}

// 상속

class JavaScriptProgrammer extends Programmer {
  constructor(
    language,
    device,
    disease,
    nation,
    age,
    junior,
    coffee,
    stress,
    framework
  ) {
    super(language, device, disease, nation, age, junior, coffee, stress);
    this.framework = framework;
  }

  introduce() {
    console.log(
      `저는 ${this.nation} 출신의 ${this.age}살 프로그래머입니다.
       저는 ${this.language} 언어를 사용하고 ${
        this.device
      } 기기를 사용합니다. 저는 ${
        this.framework
      } 프레임워크를 사용합니다. 저는 ${this.disease}를 앓고 있고, ${
        this.junior ? "주니어" : "시니어"
      } 개발자이며, 하루에 ${this.coffee}잔의 커피를 마시고, 스트레스 지수는 ${
        this.stress
      }입니다.`
    );
  }
}

const jsProgrammers = [
  new JavaScriptProgrammer(
    "JavaScript",
    "MacBook",
    "거북목",
    "한국",
    24,
    true,
    2,
    80,
    "React"
  ),
  new JavaScriptProgrammer(
    "JavaScript",
    "Windows",
    "손목터널증후군",
    "미국",
    30,
    false,
    3,
    90,
    "Angular"
  ),
  new JavaScriptProgrammer(
    "JavaScript",
    "Linux",
    "안구건조증",
    "일본",
    28,
    true,
    1,
    70,
    "Vue"
  ),
];

for (const programmer of jsProgrammers) {
  programmer.introduce();
}

console.log("========================");

class Senior {
  constructor() {
    // this.money = 0;
    this._money = 0;
  }

  get money() {
    return this._money;
  }

  set money(val) {
    this._money = val;
  }

  money2() {
    return 10000;
  }

  money3(newMoney) {
    this._money = newMoney;
  }
}

const young = new Senior();
// console.log(young.money); // 공개속성
console.log(young._money); // 비공개 속성. 가능은 하지만 쓰지 마세요 (이 상태에서도 수정까지 가능합니다)
young.money = 1000;
console.log(young.money); // 1000
console.log(young.money2); // Function
console.log(young.money2()); // 10000
console.log(young.money3); // Function
console.log(young.money); // 1000
console.log(young.money3()); // undefined
console.log(young.money); // undefined
console.log(young.money3(100000)); //undefined
console.log(young.money); // 100000
