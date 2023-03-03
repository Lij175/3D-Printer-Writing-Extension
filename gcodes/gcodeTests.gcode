; base skeleton code for writing

G28 ; Home all axes
G1 Z2 ; Move Z Axis up little to prevent scratching of Heat Bed
G1 X110 Y110 ; go to center
G0 Z0 ; lower to 0

; Stuff Go Here
G0 Z0 ; lower to 0

; box
G0 X50 Y50
G0 X50 Y235
G0 X235 Y235
G0 X235 Y50
G0 X50 Y50
; box

G1 Z0.2 ; raise a bit

G1 Z10 ;Raise Z
G90 ;Absolute positioning
G1 X0 Y220 ;Present print
M84 X Y E ;Disable all steppers but Z
