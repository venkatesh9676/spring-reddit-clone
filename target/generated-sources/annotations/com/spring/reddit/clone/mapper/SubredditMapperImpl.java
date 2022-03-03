package com.spring.reddit.clone.mapper;

import com.spring.reddit.clone.dto.SubredditDto;
import com.spring.reddit.clone.dto.SubredditDto.SubredditDtoBuilder;
import com.spring.reddit.clone.model.Subreddit;
import com.spring.reddit.clone.model.Subreddit.SubredditBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-03T18:46:33+0530",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1100.v20200828-0941, environment: Java 15 (Oracle Corporation)"
)
@Component
public class SubredditMapperImpl implements SubredditMapper {

    @Override
    public SubredditDto mapSubredditToDto(Subreddit subreddit) {
        if ( subreddit == null ) {
            return null;
        }

        SubredditDtoBuilder subredditDto = SubredditDto.builder();

        subredditDto.description( subreddit.getDescription() );
        subredditDto.id( subreddit.getId() );
        subredditDto.name( subreddit.getName() );

        subredditDto.numberOfPosts( mapPosts(subreddit.getPosts()) );

        return subredditDto.build();
    }

    @Override
    public Subreddit mapDtoToSubreddit(SubredditDto subredditDto) {
        if ( subredditDto == null ) {
            return null;
        }

        SubredditBuilder subreddit = Subreddit.builder();

        subreddit.description( subredditDto.getDescription() );
        subreddit.id( subredditDto.getId() );
        subreddit.name( subredditDto.getName() );

        return subreddit.build();
    }
}
