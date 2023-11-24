# Queue And Deque
![photo1](https://github.com/alpersener/queue-imp/blob/main/photo/photo1.png)

*   **FIFO**(First in First Out) prensibini kullanır

*   Delete işlemi en baştan olur iken insert işlemi en sondan olur.
    
    ![photo2](https://github.com/alpersener/queue-imp/blob/main/photo/photo2.png)
    

*   Queue bir interface’dir ve bunu uygulamamız için concrete class’lara ihtiyaç duyarız bu concrete class’lar ise **LinkedList** ve **PrioritiyQueue** ‘dir.

*   Bunlar thread safe değildir eğer thread safe implementasyon gerekliyse **PriorityBlockingQueue** kullanabiliriz.

*   Eleman ekleme ve silme işlemleri için kullanılan **add,remove,element** methodu dışında aynı işlevleri yapan **offer**(eleman ekleme) ,**poll**(eleman çıkarma) ve **peek** işlemleri yapan 3 method daha bulunur ancak aralarında bazı farklar vardır;
    
    *   **add,remove,element** methodları exception atarken **offer**,**poll** ve **peek** methodları exception atmaz
    
    *   **Offer** methodu eğer queue doluysa false döndürür ve exc atmaz
    
    *   **Poll** methodu eğer queue boşsa ve eleman çıkartamıyorsak “null” değeri döndürür ve exc atmaz.
    
    *   **Peek** methodu eğer queue boşsa ve başındaki elemanı alamıyorsak null değeri döndürür.   
    
  ## Custom Queue Implementation
  ![custom](https://github.com/alpersener/queue-imp/blob/main/photo/custom.png)
  
    
   *  Delete işlemi O(N) iken Insert İşlemi O(1)’dir.
    
    
  ## Circular Queue Implementation
  ### Insertion
  ![circularInsert](https://github.com/alpersener/queue-imp/blob/main/photo/circularInsert.png)
    
   *   O(1)
    
  ### Deletion
  ![circularDelete](https://github.com/alpersener/queue-imp/blob/main/photo/circularDelete.png)
    
  *   O(1)


## PriorityQueue
* Her zaman yüksek öncelikli sıradan başlar bu şekilde devam eder.

* Eğer özel olarak bir prio gerekiyorsa comparator kullanarak bunu özelleştirebiliriz.

## PriorityBlockingQueue
Bu da priorityQueue’nin aynısına sahip ancak multithread uygulamlarda kullanmak üzere tasarlanmıştır.

Linkedlist ve PriorityQueue’ya kıyasla thread safe bir yapısı vardır.

Bu özellik, multithread uygulamalarda veri paylaşımı ve işlem sırasının yönetimi için oldukça kullanışlıdır.

* * *

# Deque(Deck)

*   Bir interface’dir.

*   Queue’nin aksine iki taraftan da ekleme çıkartma işlemi yapılabilir.
  
![deque](https://github.com/alpersener/queue-imp/blob/main/photo/Deque.png)

| Queue                                                                       | Deque                                                   |
|-----------------------------------------------------------------------------|---------------------------------------------------------|
| Add elements at the back of the queue and remove elements from of the queue | add and remove elements from both end of the deque      |
| Elements can only be inserted at the end of the data structure              | Element can be inserted both ends of the data structure |
| Elements can only be removed at the front of the data structure             | Element can be removed both ends of the data structure  |
| uses Queue(FIFO)                                                            | uses Stack(LIFO) and Queue(FIFO)                        |

## ArrayDeque
Deque interface’inin implemente edilmesine ek olarak boyutu yeniden boyutlanabilir bir array sunar.

Yani dinamik olarak büyüyüp küçülebilir.

Null değerler alamaz.

LIFO ve FIFO kullanabilir.

**Faydaları**

*   Queue’nin iki tarafından da veri ekleme ve çıkartma işlemleri yapılabilir.

*   Yeniden boyutlanabilir dinamik olarak

*   Memory’nin limited olduğu durumlarda kullanmak mantıklıdır çünkü lightweight’tir.

*   Stack olarak kullanıldığında Stack’ten,Queue olarak kullanıldığında LinkedList’ten daha hızlıdır.

**Zararları;**

*   Default olarak Synchronize değildir bu da multithread ortamda verilerin sıkıntıya girebileceğini gösterir.Ancak thread safe olması için synchronizedDeque method’unu kullanabiliriz.
  
```

            Deque<String> deque = new ArrayDeque<>();
    
            // Stack (LIFO)
            deque.push("Element 1");
            deque.push("Element 2");
            deque.push("Element 3");
    
            // Stack'ten öğe çıkarma
            System.out.println("Stack Pop: " + deque.pop());
    
            // Queue (FIFO)
            deque.offer("Element 4");
            deque.offer("Element 5");
            deque.offer("Element 6");
    
            // Queue öğe çıkarma
            System.out.println("Queue Poll: " + deque.poll());
           
            System.out.println("Remaining elements in deque: " + deque);
```
