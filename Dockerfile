FROM hseeberger/scala-sbt

WORKDIR /roulette

ADD . /roulette

CMD sbt run


