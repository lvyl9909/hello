flowchart TD
    Start_3[开始] --> Loop_L_3{遍历日志 L 中的每个 σL}
    Loop_L_3 --> Calc_Phi_3[计算最小编辑距离 Φ(σL, ΣM)]
    Calc_Phi_3 --> Calc_L_fitness[L_fitness(σL, PM) = 1 - Φ(σL, ΣM) / (|σL| + min_{σM∈φf}(|σM|))]
    Calc_L_fitness --> End_Loop_3[结束循环]
    End_Loop_3 --> Return_L_fitness[返回 L_fitness(σL, PM)]
    Return_L_fitness --> End_3[结束]
    
flowchart TD
    Start_4[开始] --> Init_4[初始化空序列和最短/最长路径 σ'M 和 σ''M]
    Init_4 --> Loop_L_4{遍历日志 L 中的每个 σL}
    
    Loop_L_4 --> |σL 长度 < σ'M 长度| Calc_U_fitness_1[U_fitness(σL, PM) = 1 - |σL - σ'M| / (|σL| + min_{σM∈φf}(|σM|))]
    Loop_L_4 --> |σL 长度 > σ''M 长度| Calc_U_fitness_2[U_fitness(σL, PM) = 1 - |σL - σ''M| / (|σL| + min_{σM∈φf}(|σM|))]
    Loop_L_4 --> |σL 长度介于 σ'M 和 σ''M 之间| Set_U_fitness_1[U_fitness(σL, PM) = 1]
    
    Calc_U_fitness_1 --> End_Loop_4[结束循环]
    Calc_U_fitness_2 --> End_Loop_4
    Set_U_fitness_1 --> End_Loop_4
    
    End_Loop_4 --> Return_U_fitness[返回 U_fitness(σL, PM)]
    Return_U_fitness --> End_4[结束]
