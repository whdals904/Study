package jm.study.basic.log;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogMain {

    public static void main(String[] args) {
        log.info("LogMain - INFO");
        System.out.println("LogMain - System.out.println");
    }

}
