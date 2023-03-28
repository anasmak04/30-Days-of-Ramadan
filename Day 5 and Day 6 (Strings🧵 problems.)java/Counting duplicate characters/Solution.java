*****************************************************************************

// created at : 3/27/2023
// problem : counting duplicate character


*****************************************************************************

    class HelloWorld {
    public static void main(String[] args) {
        System.out.println(countDuplicateCharacters("heey cooders"));
    
    }

    public Map<Character, Integer> countDuplicateCharacters(String str) {

  Map<Character, Integer> result = new LinkedHashMap<>();

    for(char c : ster.toCharArray()){
        
        if(!Character.isWhitespace(c)){
            result.compute(c, (k, v) -> (v == null) ? 1 : v++);
        }

    }
      return result;
  }



    }
