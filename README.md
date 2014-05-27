play-hysterix
=============
Inspired by Hystrix, this is a library for play framework to implement scalability patterns

1. request based cache
2. request log - that captures current request only so we can display metrics
3. circuit breaker
4. metrics to be able to record, mean, timeout rates, failures vs success, etc. as per HystrixCommandMetrics.java
5. expose stream of metrics as json