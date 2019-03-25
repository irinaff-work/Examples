package concarent_collections.lambda_2;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 24.03.2019
 **/

public class MethodRefDemo {
    static String stringOp (StringFun sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda-expression is cool and efficiently";
        String outStr;
        MyStringOps myStringOps = new MyStringOps();
        outStr = stringOp(myStringOps::strReverse, inStr);
        System.out.println(outStr);
        //yltneiciffe dna looc si noisserpxe-adbmal﻿
    }
}
