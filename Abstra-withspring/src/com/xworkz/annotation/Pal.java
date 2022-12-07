package com.xworkz.annotation;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;

import org.springframework.stereotype.Component;

@Component
@Retention(CLASS)
public @interface Pal {

}
