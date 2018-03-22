package proxy;

import proxy.ProxyChain;


public interface Proxy {
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
