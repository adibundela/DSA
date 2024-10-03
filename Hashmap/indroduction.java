//           Hashing data sturucture 
//               |
//               |                    unique
//              \ /                  /
//            Dictionary ------->(key,value) 
//                                 |    |
//                                word   Meaning

/*             
                   kay = value
 *               HASH TABLE 
 *        keys       |       valuel
 *          0              
 *          1               1
 *          2               2
 *          3               
 *          4               4   
 *       Direct addrecing table (DAV)
 */

/*
 *     time compl----------> o(1)
 */
/*
 *            Hash function
 *   
 *    1.  Division modulo Hash function----->  h(v) = v % m    m = size of hash table
 *        
 *                 when 2 value have same key ------> collision
 *                                                          |                                 1.liniar probing
 *                               technique for resolution collision ---> 1. open Addresing--->2. Quardetic Probing
 *                                                                                            3. Double Hashing
 *                                                                        2. chaining ------> 
 * 
 */
/*
 *    various function of Hashmap------>1.put()
 *                                      2.get
 *                                      3. remove()
 *                                      4.entryset()
 *                                      5.containkey()
 */

 /*
  *                             MAP INTERFACE
                                /   |       \
                               /    |        \
                              /     |         \
                     HashMap   linked hashmap   Sortad Map
      - (keys unorderd)            |                  |
      - (use Hash table)           |                 Tree Map
                         -insertion order maintain 
                       - use linked list + hash table
  */

  /*             SYNTAX
   * 
   * 
   * 
   * 
   */
