; base skeleton code for writing

G28 ; Home all axes
G1 Z2 ; Move Z Axis up little to prevent scratching of Heat Bed
; Stuff Go Here

G0 X110 Y110; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; Z
G0 X8 E0.2
G0 Y13 E0.2
G0 X-8 E0.2
G0 Y-13 E0.2

G90 ; absolute positioning
G1 Z1 ; raise a bit

G1 Z10 ;Raise Z
G90 ;Absolute positioning
G1 X0 Y220 ;Present print
M84 X Y E ;Disable all steppers but Z
