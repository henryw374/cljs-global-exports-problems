

# Problem  - scoped packages do not work as global exports

```
clj -m cljs.main -co compiler-opts-scoped.cljs.edn -re node  --repl
```


at the repl:

```
(require 'problem.scoped-exports-global-exports)

; => boom!

(require 'scoped-exports-simple)

js/Something

; => yes, the scoped foreign lib has been loaded



```

