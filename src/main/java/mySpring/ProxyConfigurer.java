package mySpring;

public interface ProxyConfigurer {
    Object wrapWithProxy (ApplicationContext context , Object t, Class <?> implClass);
}
