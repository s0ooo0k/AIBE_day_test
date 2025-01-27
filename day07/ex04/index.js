const randNum = Math.floor(Math.random() * 6); // 0 include 포함, 1 exclude 제외
console.log(randNum);

switch (randNum) {
  case 0:
    console.log("1입니다");
    break;
  case 1:
    console.log("2입니다");
    break;
  case 2:
    console.log("3입니다");
    break;
  case 3:
    console.log("4입니다");
    break;
  case 4:
    console.log("5입니다");
    break;
  case 5:
    console.log("6입니다");
    break;
  case 0:
    console.log("OOps~");
    break;
}

/* 실행하지마~
while (true) {
  console.log("이거 끝나면 수업 끝남");
} */

let w = 0;
while (w < 10) {
  console.log("w", w);
  w++; // w = w + 1 // w += 1
}

let w2 = 2;
while (true) {
  if (w2 > 100) {
    break;
  }
  w2 **= 2;
  console.log(w2);
}

while (true) {
  if (Math.random() > 0.5) {
    console.log("HEAD!");
    break;
  } else {
    console.log("TAIL ㅜㅜ");
  }
}
