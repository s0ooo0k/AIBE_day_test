function solution(record) {
  // console.log(record); // 1. 매개변수를 출력;
  // 2. split을 알아야함. (문자열을 쪼개서 배열로 만드는 메서드)
  // -> LLM과 스무고개 하세요 (나한테 적절하게 조금씩 맞출 수 있게 힌트를 줘봐. 풀어달라고 하거나 한 번에 큰 힌트를 말고, 그 단계와 관련된 조금씩에 생각 확정 -> 문자열이란 건 아니까... 그것과 관련된 힌트들을 받아서 추론)
  // 최종 닉네임 4.
  const idToName = new Map();
  const msg = []; // 최종 메세지

  for (const r of record) {
    // 3. 한줄 한줄 쪼개서 (이니셜)
    // console.log(idToName);
    // console.log(r);
    // console.log(r.split()); // "" (X)
    // console.log(r.split(" ")); // " " (O)
    const action = r.split(" ")[0];
    const id = r.split(" ")[1];
    const name = r.split(" ")[2];
    // 5.
    if (action == "Enter" || action == "Change") {
      idToName.set(id, name); // set(a, b)
      // a라고 하는 key에 b라는 value를 넣는다
      // 있어도 덮어쓴다 없으면 그냥 넣는다
      // 업데이트 된다 (갱신 된다)
    }
  }
  // console.log(idToName);

  for (const r of record) {
    // 3. 한줄 한줄 쪼개서 (이니셜)
    // console.log(msg);
    // console.log(r);
    // console.log(r.split()); // "" (X)
    // console.log(r.split(" ")); // " " (O)
    const action = r.split(" ")[0];
    const id = r.split(" ")[1];
    // const name = r.split(" ")[2];
    // 6
    if (action == "Enter") {
      // map.get(key) -> 값.
      msg.push(`${idToName.get(id)}님이 들어왔습니다.`);
    } else if (action == "Leave") {
      msg.push(`${idToName.get(id)}님이 나갔습니다.`);
    }
  }
  // console.log(msg);
  return msg;
}
