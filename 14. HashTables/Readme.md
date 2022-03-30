### Hashing: 
-------------------------------------------------------------------------------------------------
-   It's a one way function(injective function) which converts any arbitary length input into a fixed length output.

### HashTables:
-------------------------------------------------------------------------------------------------
-   Defination 1: It's a associative array which makes use of hashing to store values, where the key is feed inside the hash function to get the hashCode, and then this generated hashCode is used to map inside the array to store the value. so we can say hashtable is a key-value pair data structure.
-  **index = HashFunction(key) & (n-1)**
- **NULLs are not allowed as key or Value in a Hashtable BUT in a HashMap null both as key or Value atmost once** 
- HashMap/HashTable doesn't preserve the order of inputs.



### HashMap provides 4 constructors and the access modifier of each is public which are listed as follows:
------------------------------------------------------------------------------------------------------
- HashMap()  **Default capacity = 11**
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
7. hm.keySet() // gives all the keys in a set because keys cannot be duplicated.
8. hm.values() // gives all the values in a collection object.
9. hm.containsKey(key)


10. hm.entrySet()
- for(Map.Entry entry: hm.entrySet()){
    entry.getKey() + " " + entry.getValue(); 
}


### Questions on hashTables:
- https://leetcode.com/problems/unique-number-of-occurrences
- https://leetcode.com/problems/two-sum/
- https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/
- https://www.geeksforgeeks.org/find-missing-elements-of-a-range/