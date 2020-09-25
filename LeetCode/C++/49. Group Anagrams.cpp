class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<char,int> inn;
        unordered_map< unordered_map<char,int> , vector<string>>hs;
        int n=strs.size();
        string temp;
        for(string s :strs)
        {
            for(int i=0;i<s.length();i++)
                inn[s[i]]++;
            hs[inn].push_back(s);
        }
        vector<vector<string>> result;
        for(auto i=hs.begin();i!=hs.end();i++)
            result.push_back(i->second);
        return result;
    }
};
