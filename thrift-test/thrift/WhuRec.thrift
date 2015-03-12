namespace java cn.agezhc.thrift.recommend
namespace cpp whurec

struct PRRequest{
1:i64 stuid;
2:i32 page_size;
3:i32 page_index;
}

struct PRResponse{
1:i32 actual_size;
2:i32 page_index;
}

service Recommender{
PRResponse recommend(1:PRRequest request);
}