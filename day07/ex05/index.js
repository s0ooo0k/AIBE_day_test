for (let index = 0; index < 10; index++) {
  if (index % 2 == 0) {
    continue; // 하던걸 일단 멈춰. 근데 반복은 continue. (stop은 하고.)
  }
  console.log("index", index);
}

for (;;) {
  //for문의 무한반복
  break;
}
