package ru.otus.example.beansscopesdemo.services;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope(proxyMode = ScopedProxyMode.INTERFACES)
@Service("SessionGreetingService")
public class SessionGreetingServiceImpl extends AbstractGreetingServiceImpl {
}
