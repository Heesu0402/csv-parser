package jang.heesu.study.parser

import com.sun.org.apache.bcel.internal.generic.ArrayType


//TODO Line Parser가 여러개일 이유가 있는가? Object로 선언하면 안되는 이유
/**
   object 로 선언하는 경우 singleton 객체(동반객체)
   인스턴스가 오직 1개만 생성 = 전역적으로 접근 가능(데이터공유 쉬움) + 메모리 이득
   FileParser 는 데이터를 불러오는 부분으로 object 로 만들어서 사용
 */
class LineParser {
  /**
   * 분석파일을 루프 돌며 배열에 넣는 기능
   *
   * @Param String targetFileData
   * @Return Array targetData
   * */
  def repeatParsing(targetFileData : String): ArrayType = {
    ???
  }

  /**
   * 파일을 읽는 기능
   * @Param String fileData
   * @Return String targetFileData
   * */
  def findFileData(fileData : String): String = {
    ???
  }

}


