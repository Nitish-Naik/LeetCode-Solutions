class RemoveAllOccurence_1910 {
    public String removeOccurrences(String s, String part) {
        // Method - 1
        // while(s.contains(part)) {
        //     s = s.replaceFirst(part, "");
        // }
        // return s;

        // Method -2;

        int n = part.length();
        while(s.contains(part)) {
            int idx = s.indexOf(part);
            s = s.substring(0, idx) + s.substring(idx+n);
        }
        return s;
    }
}
