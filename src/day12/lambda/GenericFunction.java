package day12.lambda;

public interface GenericFunction <X, Y> {

  // X를 주면 Y를 줄게 ( 사과를 주면 사과의 ㅇㅇ 을 줄게)
  Y apply (X x);
}
