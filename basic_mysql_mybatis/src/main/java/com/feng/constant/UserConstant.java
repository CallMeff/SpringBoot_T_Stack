package com.feng.constant;

/**
 * @desc：用户相关常量
 * @title：UserConstant
 * @author: tianfengluyao
 * @date: 2018/11/14 13:42
 */
public class UserConstant {

    //用户语言
    public enum LanguageEnum{
        CHINESE("0","中文","你好"),
        ENGLISH("1","英文","hello");

        private String code;
        private String desc;
        private String sayHelloWord;

        LanguageEnum(String code, String desc, String sayHelloWord) {
            this.code = code;
            this.desc = desc;
            this.sayHelloWord = sayHelloWord;
        }

        public static String getSayHelloWord(String code){
            for (LanguageEnum languageEnum:LanguageEnum.values()) {
                if(code.equals(languageEnum.code)){
                    return languageEnum.sayHelloWord;
                }
            }
            return null;
        }
    }
}
