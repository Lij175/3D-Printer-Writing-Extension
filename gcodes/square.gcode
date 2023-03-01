; base skeleton code for writing

G28 ; Home all axes
G1 Z2 ; Move Z Axis up little to prevent scratching of Heat Bed
G0 X110 Y110 ; go to center
G0 Z0 ; lower to 0

; Stuff Go Here
[I@3cb5cdba
[I@56cbfb61
[I@1134affc
[I@d041cf
[I@3cb5cdba

G1 Z10 ;Raise Z
G90 ;Absolute positioning
G1 X0 Y220 ;Present print
M84 X Y E ;Disable all steppers but Z
