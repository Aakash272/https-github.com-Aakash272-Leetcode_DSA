select user_id,
       count(*) as prompt_count,
       round(Avg(tokens),2) as avg_tokens
       from prompts
       group by user_id
       having Max(tokens)>avg_tokens AND count(tokens) >=3
       order by avg_tokens desc,user_id asc;