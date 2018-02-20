Flaky Services
--------------

This small project demonstrates how to deal with flaky services that times out and throws errors using [Spring Retry](https://github.com/spring-projects/spring-retry).

## Usage

Build/run using gradle

```bash
./graldew :bootRun
```

Run any of the examples

```bash
# Query the Ads service without any retry logic
scripts/normal.sh

# Query the Ads service with retry logic.
scripts/retry.sh

# Query the Ads service with circuit breaker logic.
scripts/circuit-breaker.sh
```
