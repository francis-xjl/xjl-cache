找了很久，很希望有一款缓存，能够支持以下特点：

1. 围绕Spring Cache(JSR 107)标准扩展
2. 吸收jetcache的多级缓存机制、超时时间机制 
3. 吸收jetcache的统计数据机制
4. 支持redis6
5. 支持单独的方法去清理缓存，或者提供一套管理机制
6. key \ value序列化使用jackson/fastjson方式
7. 基于java8
8. 内存缓存持久化(应用重启后可恢复)
9. 能够在mybatis的mapper上直接缓存