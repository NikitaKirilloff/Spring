package ru.otus.example.beansscopesdemo.services;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope(proxyMode = ScopedProxyMode.INTERFACES)
@Service("RequestGreetingService")
public class RequestGreetingServiceImpl extends AbstractGreetingServiceImpl {
}
