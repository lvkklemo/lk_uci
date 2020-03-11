## 基于SpringBoot实现的微服务



### 1.SpringBoot+SpringCloud

- 服务发现——Netflix Eureka

- 服务调用——Netflix Feign

- 熔断器——Netflix Hystrix

  Feign 本身支持Hystrix，不需要额外引入依赖。

  1.修改daxing_recruit模块的application.yml ，开启hystrix

  ```yaml
  feign:
    hystrix:
      enabled: true
  ```

  2.在com.gedu.client包下创建impl包，包下创建熔断实现类，实现自接口 UserClientImpl

  ```java
  @Component
  public class UserClientImpl implements UserClient {
      @Override
      public Result findAllUser() {
          return new Result(false, StatusCode.ERROR,"熔断器启动了");
      }
  
      @Override
      public Result findUserDetail(String userId) {
          return new Result(false, StatusCode.ERROR,"熔断器启动了");
      }
  }
  ```

  3.修改UserClient的注解 

  ```java
  @FeignClient(value = "jerry",fallback = UserClientImpl.class)
  public interface UserClient {
      @RequestMapping(value = "/user/find",method = RequestMethod.GET)
      public Result findAllUser();
  
      @RequestMapping(value = "/user/detail",method = RequestMethod.GET)
      public Result findUserDetail(@RequestParam("userId") String userId);
  }
  ```

  4.重新启动recruit微服务，测试看熔断器是否运行。

- 服务网关——Netflix Zuul


### 2.Redis

### 3.RabbitMQ

