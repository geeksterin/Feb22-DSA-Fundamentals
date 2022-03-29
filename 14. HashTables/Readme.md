### Hashing: 
-   It's a one way function which converts any arbitary length input into a fixed length output.

### HashTables:
-   Defination 1: It's a associative array which makes use of hashing to store values, where the key in feed inside the hash function to get the hashCode, and then this hashCode is used to map inside the array to store the value. so we say hashtable is a key-value pair data structure.

- index = HashFunction(key) & (n-1).

-   hashcode() and equals() working in java.


HashMap provides 4 constructors and the access modifier of each is public which are listed as follows:

- HashMap()
- HashMap(int initialCapacity)
- HashMap(int initialCapacity, float loadFactor)
- HashMap(Map map)

### Most commonly used methods of hashMaps
-------------------------------------------------------------------------------------------------
1. hm.put(key,value);
2. hm.get(key) aka also for replace.
3. hm.getOrDefault(key,0)+1 *** 
4. hm.remove(key);
5. hm.size()
6. hm.clear()
7. hm.entrySet()
8. hm.keySet()
9. hm.containsKey(key)


### Questions on hashTables:
- https://leetcode.com/problems/unique-number-of-occurrences
- https://leetcode.com/problems/two-sum/
- https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/
- https://www.geeksforgeeks.org/find-missing-elements-of-a-range/