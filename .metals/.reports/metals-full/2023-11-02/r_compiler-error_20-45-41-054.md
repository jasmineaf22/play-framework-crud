file:///C:/Users/jasmi/play/test/app/controllers/Application.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
offset: 285
uri: file:///C:/Users/jasmi/play/test/app/controllers/Application.java
text:
```scala
package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import java.util.*;
import models.*;

public class Application extends Controller {

    public static void index() {
        return Results.ok();
    }

    public static @@void test() {
        return Results.ok();
    }

    public static void proses(int x, int y) {
        int hasil = x + y;
        return Results.ok(Integer.toString(hasil));
    }

    public static void newMahasiswa() {
        return ok();
    }

    public static void buatBaru(Mahasiswa objmhs) {
        objmhs.nama = objmhs.nama + " test";
        return Results.ok(objmhs);
    }
}
```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:329)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator